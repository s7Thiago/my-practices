import java.util.*;
import java.io.*;																	

public class Main
{
	public static void main(String[] args) {
		File diretorio = new File("/dev");
		for(File file : diretorio.listFiles()) {
			System.out.println(file);
		}
		
	}
}
