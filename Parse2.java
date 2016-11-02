import java.io.*;
import java.util.*;
class Parse2
{
	public static void main(String args[])throws Exception
	{
		String fileName = args[0];
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		int n ,m;
		//System.out.println(n);
		HashMap<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
		String temp;
		while((temp = br.readLine()) != null){
			String tempArray[] = temp.split("\t");
			m = Integer.parseInt(tempArray[0]);
			n = Integer.parseInt(tempArray[1]);
			if(map.containsKey(m))
			{
				//System.out.println(m+" to "+n);
				map.get(m).add(n);
			}
			else
			{
				List<Integer> tempList = new ArrayList<Integer>();
				map.put(m,tempList);
				map.get(m).add(n);
				//System.out.println(m+" to "+n);
			}
		}
			//System.out.println(Arrays.toString(tempList.toArray()));
			//tempList.clear();
		File out = new File("output2.dat");
		out.createNewFile();
		int d = 0;
		FileWriter writer = new FileWriter(out);

		for(int i = 0; i <= map.size(); i++) 
		{
			int size;
			if(map.containsKey(i))
			{
				size = map.get(i).size();
			}
			else
			{
				continue;
			}

			writer.write((i)+" ");
			writer.write(d+" ");
			for (int j = 0; j < size; j++) {
				//System.out.println(group.get(i).get(j)+":");
				writer.write(map.get(i).get(j)+":");
			}
			writer.write("\n");
			d = 125;
		}
		writer.flush();
		writer.close();
	}
}