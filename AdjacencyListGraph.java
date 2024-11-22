package com.srkr.basics; 
  
import java.util.ArrayList; 
import java.util.Comparator; 
import java.util.HashMap; 
import java.util.List; 
import java.util.Map; 
import java.util.PriorityQueue; 
import java.util.stream.Collectors; 
  
class AdjacencyListGraph { 
    private static Map<Location, List<Edge>> adjacencyList; 
  
    public AdjacencyListGraph1() { 
        adjacencyList = new HashMap<>(); 
    } 
    // Method to add a new location node to the graph 
    public void addLocation(Location location) { 
        adjacencyList.put(location, new ArrayList<>()); 
    } 
    // Method to add a new edge (connection) between two locations in the 
graph 
    public void addEdge(Location from, Location to, int distance) { 
        Edge edge = new Edge(from, to, distance, distance); 
        adjacencyList.get(from).add(edge); 
        // If the graph is undirected, you can add the reverse edge as well 
        Edge reverseEdge = new Edge(to, from, distance, distance); 
        adjacencyList.get(to).add(reverseEdge); 
    } 
    public Map<Location, List<Location>> dijkstra(Location source,boolean 
isTimeBased) { 
        Map<Location, Integer> distances = new HashMap<>(); 
        Map<Location, Location> previousNodes = new HashMap<>(); 
        PriorityQueue<Edge> pq ; 
        if(isTimeBased) { 
         pq=new PriorityQueue<>(Comparator.comparingInt(e -> e.time));  
distances.put(source, 0); 
             pq.offer(new Edge(source, source, 0, 0)); 
        } 
        else { 
         pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.distance)); 
         distances.put(source, 0); 
            pq.offer(new Edge(source, source, 0,0)); 
        } 
        while (!pq.isEmpty()) { 
            Edge currentEdge = pq.poll(); 
            Location current = currentEdge.to; 
  int currentDistance = currentEdge.distance; 
  
            for (Edge edge : adjacencyList.getOrDefault(current, new ArrayList<>())) 
{ 
                int newDistance = currentDistance + edge.distance; 
                Location destination = edge.to; 
  
                if (!distances.containsKey(destination) || newDistance < 
distances.get(destination)) { 
                    distances.put(destination, newDistance); 
                    pq.offer(new Edge(current, destination, newDistance, 
newDistance)); 
                    previousNodes.put(destination, current); // Update the previous 
node for the shortest path 
                } 
            } 
        } 
        Map<Location, List<Location>> shortestPaths = new HashMap<>(); 
        for (Location destination : distances.keySet()) { 
            if (!destination.equals(source)) { // Skip the source location itself 
                List<Location> path = new ArrayList<>(); 
                Location current = destination; 
                while (current != null) { 
                    path.add(0, current); 
                    current = previousNodes.get(current); 
                } 
                shortestPaths.put(destination, path); 
            } 
        } 
  
 return shortestPaths; 
    } 
    public static List<Edge> getEdges(Location from, Location to) { 
        return adjacencyList.getOrDefault(from, new ArrayList<>()).stream() 
                .filter(edge -> edge.to == to) 
                .collect(Collectors.toList()); 
    } 
    public void printGraph() { 
        for (Location location : adjacencyList.keySet()) { 
            List<Edge> edges = adjacencyList.get(location); 
            System.out.print(location.name + " -> "); 
            for (Edge edge : edges) { 
                System.out.print(edge.to.name + "(" + edge.distance + ") "); 
            } 
            System.out.println(); 
        }
    } 
    public static int getShortestDistance(Map<Location, List<Location>> 
shortestPaths, Location source, Location destination) { 
        if (source.equals(destination)) { 
            return 0; 
        } 
  
        List<Location> shortestPath = shortestPaths.get(destination); 
        if (shortestPath != null) { 
            int distance = 0; 
            for (int i = 0; i < shortestPath.size() - 1; i++) { 
                Location current = shortestPath.get(i); 
                Location next = shortestPath.get(i + 1); 
                List<Edge> edges = null; 
try { 
edges = getEdges(current, next); 
} catch (Exception e) { 
e.printStackTrace(); 
}  
                if (edges != null && !edges.isEmpty()) { 
                    distance += edges.get(0).distance; 
                } 
 } 
            return distance; 
        } 
        return -1; 
    } 
    public double findShortestTime(Location source,Location destination) { 
     Map<Location, List<Location>> shortestPaths = dijkstra(source,true); 
     int distance = getShortestDistance(shortestPaths,source,destination); 
     double time = 2*distance; 
     return time; 
    } 
     
} 
