package com.sort;

import java.util.ArrayList;

public class RouteProblem {
	
	public static ArrayList<String> nameOfRoutes = new ArrayList<String>();
	public static ArrayList<Integer> costOfRoutes = new ArrayList<Integer>();

	public static void applyTolls(int input1,int input2,String[] input3){
    	
		int[][] routes = new int[6][];
		int[][] costs = new int[6][];
		
		for(int i=0;i<input1;i++ ){
			int temp = 0;
			for(int j=0;j<input3.length;j++){
				if( (i+1) == ((int)input3[j].charAt(0)-48)){
					temp++;
				}
			}
			int[] listRoute = new int[temp];
			int[] listCost = new int[temp];
			temp = 0;
			for(int j=0;j<input3.length;j++){
				String[] str = input3[j].split("#");
				if( (i+1) == Integer.valueOf(str[0])){
					listRoute[temp] = Integer.valueOf(str[1]);
					listCost[temp] = Integer.valueOf(str[2]); 
					temp++;
				}
			}
			routes[i] = listRoute;
			costs[i] = listCost; 
		}
		getRoute(1, input1, routes, costs, "1", 0);
    }
	
	public static void getRoute(int start, int end, int[][] routes, int[][] costs, String route, int totalCost){
		
		String route1 = route;
		int totalCost1 = totalCost;
		int start1 = start;
		int[] routes1 = routes[start1-1];
		int[] costs1 = costs[start1-1];
		if(start1 == end){
			nameOfRoutes.add(route1);
			costOfRoutes.add(totalCost1);
		}else{
			for(int i=0; i<routes1.length;i++){
				start1 = routes1[i];
				String route2 = route1 + "#" + start1;
				int totalCost2 = totalCost1 + costs1[i];
				getRoute(start1, end, routes, costs, route2, totalCost2);
			}
		}
	}

	public static void main(String ... args){
		
		String[] input3 = {"1#2#8","1#4#7", "1#5#12", "2#3#4", "2#4#2", "3#6#6", "4#6#8", "5#6#10"};
		
		applyTolls(6, 8, input3);
		
		System.out.println("No. of routes: "+nameOfRoutes.size());
		for(int i=0; i<nameOfRoutes.size();i++){
			System.out.print("Route "+(i+1)+": "+nameOfRoutes.get(i)+" || ");
			System.out.println("Cost "+(i+1)+": "+costOfRoutes.get(i));
		}
	}
}
