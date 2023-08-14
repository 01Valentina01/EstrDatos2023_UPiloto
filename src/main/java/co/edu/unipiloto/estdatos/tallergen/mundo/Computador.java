/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estdatos.tallergen.mundo;

/**
 *
 * @author User
 */
public class Computador extends Electronico{
    
    public enum SistOperativo
	{
		WINDOWS, LINUX, MAC, UNIX, SOLARIS, GOOGLE, DEBIAN, UBUNTU,
                MANDRIVA, SABAYON, FEDORA, REACTOS
	}
    
        private SistOperativo sistOperativo;
        
    public Computador(SistOperativo psistOperativo, Gama pGama, double pPrecio) {
        super(pGama, pPrecio);
        sistOperativo = psistOperativo;
    }

    @Override
    public String toString() {
        return "Computador " + sistOperativo.name() + " - " +"Gama " + gama + "($ "+precio + ")";
    }
    
    
}
