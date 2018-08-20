package ejercicios;

import java.util.ArrayList;
import java.util.Comparator;

import ejercicios.beans.RankingBean;


public class RankingVideo {
	
	static ArrayList<String> listIdsVideos = new ArrayList<String>();
	static ArrayList<String> listReproductions= new ArrayList<String>();
	static ArrayList<RankingBean> listRankingBean = new ArrayList<>();
	
	public static void main (String args []) {
		
		//lista de ID de los videos
		listIdsVideos.add("video1"); 
		listIdsVideos.add("video2");  
		listIdsVideos.add("video3");
		
		//lista de reproducciones
		listReproductions.add("video1");
		listReproductions.add("video2");
		listReproductions.add("video1");
		listReproductions.add("video1");
		listReproductions.add("video3");
		listReproductions.add("video3");
		
		// se cargan los videos de acuerdo al id y se suma el numero de veces que esta en la lista de reproducciones 
		getAllVideos ();
		
		
		// Devuelve los vídeos más vistos, en orden, limitando el resultado por el numero de resultados dado
		getRank(3);
		
		// Devuelve la posicion del video dado su ID
		getRankVideo("video3");
		
		// Imprime el top ten de los videos más vistos
		showTopTen();
	}
	
	/**
	 * Imprime la lista de acuerdo al numero de reproducciones
	 * */
	private static void showTopTen() {
		StringBuilder sb;
		
		for (RankingBean rb : listRankingBean ) {
			
			sb = new StringBuilder();
			
			sb.append(rb.getVideoId());
			sb.append(" - ");
			sb.append(rb.getCountVideo());
			sb.append(" reproducciones");
			
			System.out.println(sb.toString());
		}
		
	}


	/**
	 * Se recorre el arraylist y se le asigna un contador ya que esta ordenado de mayor a menor
	 * obteniendo su posición
	 * */
	private static void getRankVideo(String videoId) {
		
		// menor a mayor
		//listRankingBean.sort(Comparator.comparingInt(RankingBean :: getCountVideo));
		int position = 0;
		
		for (RankingBean rb : listRankingBean ) {
			position ++;
			if (videoId.equals(rb.getVideoId()))
				System.out.println(position);
		}
		
	}

	
	/**
	 * Se cargan los videos de acuerdo al id y se suma el numero de veces que esta en la lista de reproducciones 
	 * */
	private static void getAllVideos() {
		int count = 0;
		RankingBean rankingBean;
				
		for (String ids : listIdsVideos) {
			
			rankingBean =  new RankingBean();
			
			for (String reproduction :  listReproductions) {
				if (ids.equals(reproduction)) {
					count ++;
					rankingBean.setVideoId(reproduction);
					rankingBean.setCountVideo(count);
				}
			}
			
			listRankingBean.add(rankingBean);
			count = 0;
		}

	}


	
	/** 
	 * 
	 * Se ordena la lista de Id´s unicos, con la cantidad de veces que aparece en la lista de mayor a menor
	 * y devuelve el numero de resultados dado 
	 *  
	 * */
	private static void getRank(int result) {
		int count = 0;
		
		//mayor a menor
		listRankingBean.sort(Comparator.comparingInt(RankingBean :: getCountVideo).reversed());
		
		int sizeList = listRankingBean.size();
		
		if (result <= sizeList) {
			for (RankingBean rb : listRankingBean ) {
				if (count == result) {
					break;
				} else {			
					System.out.println(rb.getVideoId());
				}	
				count ++;
			}
		} else {
			System.out.println("El tamaño de las lista es de: " +sizeList);
		}
	} 
	
	
	

}
