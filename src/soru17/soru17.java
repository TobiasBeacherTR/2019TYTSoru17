package soru17;

public class soru17 {

	public static void main(String[] args) {
		
		int indirim=2;
		int urun_adedi=5;
		int odeme=43;
		int tutar=45;
		
		int toplam_indirim=indirim*urun_adedi;
		int indirimsiz=odeme+toplam_indirim;
		int son_urun=indirimsiz-tutar;
		
		System.out.println("Son alýnan ürünün fiyatý : " + son_urun + " tl dir.");
	}

}
