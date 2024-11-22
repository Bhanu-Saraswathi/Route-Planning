package com.srkr.basics; 
  
class Edge { 
    Location from; 
    Location to; 
    int distance; 
    int time; 
  
    public Edge(Location from, Location to, int distance,int time) { 
        this.from = from; 
        this.to = to; 
        this.distance = distance; 
        this.time=time; 
    } 
} 
