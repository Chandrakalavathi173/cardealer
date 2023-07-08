public class cardealeruse extends cardealer{
	public static void main(String[] args) {
		cardealer cd=new cardealer();
		String[] arr= new String[]{"Polo Trendline","Polo Highline","Virtus Trendline","Virtus Highline","Taigun Trendline","Taigun Highline","Taigun Topline"};
		long[] cost=new long[]{870000,1009000,1105000,1308000,1489000,1542000,1771000};
		cd.getInfo();
		for(int i=0;i<arr.length;i++)
	  	{
			
			if(arr[i].equals(cd.getCarmodel()))
			{
				cd.getCost(arr[i], cost[i]);
				
			}
		}
	}

}

