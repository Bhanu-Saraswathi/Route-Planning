package com.srkr.basics; 
  
import java.util.HashMap; 
import java.util.List; 
import java.util.Map; 
import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) { 
        AdjacencyListGraph graph = new AdjacencyListGraph(); 
 // Create a map to store Location objects by their names 
        Map<String, Location> locationMap = new HashMap<>(); 
  
        Location locA = new Location("Bhimavaram"); 
        Location locB = new Location("Veeravasaram"); 
        Location locC = new Location("Palakollu"); 
        Location locD = new Location("Mogalthuru"); 
        Location locE = new Location("Taderu"); 
        Location locF = new Location("Narsapuram"); 
        Location locG = new Location("Tanuku"); 
        Location locH = new Location("Tadepalligudem"); 
        Location locI = new Location("Rajamundry"); 
        Location locJ = new Location("Vijayawada"); 
        Location locK = new Location("Gudiwada"); 
        Location locL = new Location("vizag"); 
        Location locM = new Location("Ongole"); 
  
        // Add Location nodes to the graph and the map 
        graph.addLocation(locA); 
        graph.addLocation(locB); 
        graph.addLocation(locC); 
        graph.addLocation(locD); 
        graph.addLocation(locE); 
        graph.addLocation(locF); 
        graph.addLocation(locG); 
        graph.addLocation(locH); 
        graph.addLocation(locI); 
        graph.addLocation(locJ); 
        graph.addLocation(locK); 
        graph.addLocation(locL); 
        graph.addLocation(locM); 
         // Add edges (connections) between locations in the graph 
        graph.addEdge(locA, locB, 12); 
        graph.addEdge(locB, locC, 12); 
        graph.addEdge(locC, locF, 10); 
        graph.addEdge(locA, locD, 23); 
        graph.addEdge(locD, locF, 17); 
        graph.addEdge(locA, locE, 5); 
        graph.addEdge(locE, locF, 27); 
        graph.addEdge(locA, locG, 38);  
       graph.addEdge(locC, locG, 34); 
        graph.addEdge(locA, locH, 31); 
        graph.addEdge(locA, locI, 75); 
        graph.addEdge(locG, locH, 24); 
        graph.addEdge(locG, locI, 41); 
        graph.addEdge(locH, locI, 40); 
        graph.addEdge(locA, locJ, 132); 
        graph.addEdge(locK, locJ, 41); 
        graph.addEdge(locA, locK, 64); 
        graph.addEdge(locA, locC, 24); 
        graph.addEdge(locL, locA, 268); 
        graph.addEdge(locA, locM, 236); 
        graph.addEdge(locB, locD, 20); 
        graph.addEdge(locB, locE, 13); 
        graph.addEdge(locB, locF, 19); 
        graph.addEdge(locB, locG, 30); 
        graph.addEdge(locB, locH, 41); 
        graph.addEdge(locB, locI, 75); 
        graph.addEdge(locB, locJ, 117); 
        graph.addEdge(locB, locK, 76); 
        graph.addEdge(locB, locL, 267); 
        graph.addEdge(locB, locM, 248); 
        graph.addEdge(locC, locD, 19); 
        graph.addEdge(locC, locE, 26); 
        graph.addEdge(locC, locH, 53); 
        graph.addEdge(locC, locI, 69); 
        graph.addEdge(locC, locJ, 157); 
        graph.addEdge(locC, locK, 109); 
        graph.addEdge(locC, locL, 259); 
        graph.addEdge(locC, locM, 255); 
        graph.addEdge(locD, locE, 18); 
        graph.addEdge(locD, locG, 55); 
        graph.addEdge(locD, locH, 54); 
        graph.addEdge(locD, locI, 89); 
        graph.addEdge(locD, locJ, 138); 
        graph.addEdge(locD, locK, 90); 
        graph.addEdge(locD, locL, 279); 
        graph.addEdge(locD, locM, 235); 
        graph.addEdge(locE, locG, 43); 
         graph.addEdge(locE, locH, 36); 
        graph.addEdge(locE, locI, 92);  
        graph.addEdge(locE, locJ, 143); 
        graph.addEdge(locE, locK, 96); 
        graph.addEdge(locE, locL, 283); 
        graph.addEdge(locE, locM, 240); 
        graph.addEdge(locF, locG, 46); 
        graph.addEdge(locF, locH, 63); 
        graph.addEdge(locF, locI, 79); 
        graph.addEdge(locF, locJ, 148); 
        graph.addEdge(locF, locK, 99); 
        graph.addEdge(locF, locL, 270); 
        graph.addEdge(locF, locM, 245); 
        graph.addEdge(locG, locJ, 131); 
        graph.addEdge(locG, locK, 113); 
        graph.addEdge(locG, locL, 230); 
        graph.addEdge(locG, locM, 280); 
        graph.addEdge(locH, locJ, 112); 
        graph.addEdge(locH, locK, 94); 
        graph.addEdge(locH, locL, 237); 
        graph.addEdge(locH, locM, 260); 
        graph.addEdge(locI, locJ, 162); 
        graph.addEdge(locI, locK, 144); 
        graph.addEdge(locI, locL, 191); 
        graph.addEdge(locI, locM, 310); 
        graph.addEdge(locJ, locK, 41); 
        graph.addEdge(locJ, locL, 344); 
        graph.addEdge(locJ, locM, 150); 
        graph.addEdge(locK, locL, 327); 
        graph.addEdge(locK, locM, 189); 
        graph.addEdge(locL, locM, 492); 

     // Store Location objects in the map 
        locationMap.put("bhimavaram", locA); 
        locationMap.put("veeravasaram", locB); 
        locationMap.put("palakollu", locC); 
        locationMap.put("mogalthuru", locD); 
        locationMap.put("taderu", locE); 
        locationMap.put("narsapuram", locF); 
        locationMap.put("tanuku", locG); 
         locationMap.put("tadepalligudem", locH); 
        locationMap.put("rajamundry", locI); 
        locationMap.put("vijayawada", locJ); 
        locationMap.put("gudiwada", locK); 
        locationMap.put("vizag", locL); 
        locationMap.put("ongole", locM); 
  
        System.out.println("adjacencylist matrix");
        graph.printGraph(); 
        Scanner scanner = new Scanner(System.in); 
        int choice; 
        do { 
            System.out.println("\n--- MENU ---"); 
            System.out.println("1. Show available paths from a location"); 
            System.out.println("2. Find the shortest path between source and 
destination"); 
            System.out.println("3. Find the shortest distance between source and 
destination"); 
            System.out.println("4. Find the shortest time between source and 
destination"); 
            System.out.println("5. Exit"); 
            System.out.print("Enter your choice: "); 
            choice = scanner.nextInt(); 
            switch (choice) { 
            case 1: 
                scanner.nextLine(); // Consume the newline left by nextInt() 
                System.out.print("Enter the source location: "); 
                String sourceName1 = scanner.nextLine().toLowerCase(); 
                Location source1 = locationMap.get(sourceName1); 
  
                if (source1 == null) { 
                    System.out.println("Location not found!"); 
                    break; 
                } 
                Map<Location, List<Location>> shortestPaths1 = 
graph.dijkstra(source1, false); 
  
                for (Location destination : shortestPaths1.keySet()) { 
                    if (!destination.equals(source1)) {                          
List<Location> path = shortestPaths1.get(destination); 
                        int distance =   
 AjacencyListGraph.getShortestDistance(shortestPaths1, source1, 
destination); 
                        System.out.print(destination.name + " (" + distance + " km): "); 
                        for (Location pathLocation : path) { 
                            System.out.print(pathLocation.name + " -> "); 
                        } 
                        System.out.println(); 
                    } 
                } 
                break; 
            case 2: 
                scanner.nextLine(); // Consume the newline left by nextInt() 
                System.out.print("Enter the source location: ");
                 String sourceName2 = scanner.nextLine().toLowerCase(); 
                System.out.print("Enter the destination location: "); 
                String destinationName2 = scanner.nextLine().toLowerCase(); 
                Location source2 = locationMap.get(sourceName2); 
                Location destination2 = locationMap.get(destinationName2); 
  
                if (source2 == null || destination2 == null) { 
                    System.out.println("Source or Destination not found!"); 
                    break; 
                } 
  
                Map<Location, List<Location>> shortestPaths2 = 
graph.dijkstra(source2, false); 
                List<Location> shortestPath2 = shortestPaths2.get(destination2); 
                if (shortestPath2 != null) { 
                    int distance2 = 
AdjacencyListGraph.getShortestDistance(shortestPaths2, source2, 
destination2); 
                    System.out.print("Shortest path: "); 
                    for (Location location : shortestPath2) { 
                        System.out.print(location.name + " -> "); 
                    } 
                    System.out.println(" (Distance: " + distance2 + " km)"); 
                } else { 
                    System.out.println("There is no path between " + sourceName2 + " 
and " + destinationName2 + ".");    
} 
                break; 
            case 3: 
                scanner.nextLine(); // Consume the newline left by nextInt() 
                System.out.print("Enter the source location: "); 
                String sourceName3 = scanner.nextLine().toLowerCase(); 
                System.out.print("Enter the destination location: "); 
                String destinationName3 = scanner.nextLine().toLowerCase(); 
                Location source3 = locationMap.get(sourceName3); 
                Location destination3 = locationMap.get(destinationName3); 
  
                if (source3 == null || destination3 == null) { 
                    System.out.println("Source or Destination not found!"); 
                    break; 
                } 
                Map<Location, List<Location>> shortestPaths3 = 
graph.dijkstra(source3, false); 
                int distance3 = 
AdjacencyListGraph.getShortestDistance(shortestPaths3, source3, 
destination3); 
  
                if (distance3 != -1) { 
 System.out.println("Shortest distance from " + sourceName3 + " to 
" + destinationName3 + ": " + distance3 + " km"); 
                } else { 
                    System.out.println("There is no path between " + sourceName3 + " 
and " + destinationName3 + "."); 
                } 
                break; 
            case 4: 
             scanner.nextLine(); // Consume the newline left by nextInt() 
                System.out.print("Enter the source location: "); 
                String sourceName5 = scanner.nextLine().toLowerCase(); 
                System.out.print("Enter the destination location: "); 
                String destinationName5 = scanner.nextLine().toLowerCase(); 
                Location source5 = locationMap.get(sourceName5); 
                Location destination5 = locationMap.get(destinationName5); 
  
                if (source5 == null || destination5 == null) { 
                    System.out.println("Source or Destination not found!"); 
                    break;      
} 
  
                double shortestTime = graph.findShortestTime(source5, 
destination5); 
                if (shortestTime != -1) { 
                    System.out.println("Shortest time from " + sourceName5 + " to " + 
destinationName5 + ": " + shortestTime + " minutes"); 
                } else { 
                    System.out.println("There is no path between " + sourceName5 + " 
and " + destinationName5 + "."); 
                } 
                break; 
            case 5: 
             System.out.println(); 
             exit(); 
                break; 
                
            default: 
                System.out.println("Invalid choice! Please try again."); 
                break; 
            } 
        }while(choice!=6); 
} 
    private static void exit() { 
System.out.println("Exiting.........."); 
    System.exit(0);  
} 
  
} 
