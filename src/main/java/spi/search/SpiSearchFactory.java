package spi.search;

import java.util.ServiceLoader;

public class SpiSearchFactory {
	
	public static void main(String[] args){
		
		ServiceLoader<Search> searchs = ServiceLoader.load(Search.class);  
		
		for(Search s : searchs ){
			
            s.search("test");  
			
		}
		
	}
	
}
