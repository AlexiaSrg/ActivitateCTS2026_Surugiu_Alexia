package src.seminar02.main;

import src.seminar02.clase.Aplicant;
import src.seminar02.clase.readers.ReaderAngajati;
import src.seminar02.clase.readers.ReaderAplicanti;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		Aplicant.setPragPunctaj(85);
		try {
			ReaderAplicanti ra= new ReaderAngajati("angajati.txt");
			listaAngajati=ra.readAplicanti();
			for(Aplicant aplicant:listaAngajati) {
				System.out.println(aplicant.toString());
				aplicant.afisareVenit();
				aplicant.afisareStatut();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch blk
			e.printStackTrace();
		}
	}

}
