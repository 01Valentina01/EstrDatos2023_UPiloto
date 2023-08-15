package co.edu.unipiloto.estdatos.tallergen.mundo;

public class Casillero <T>{

	private T producto;

	public Casillero ()
	{
		producto = null;
	}

	public boolean agregar(Producto pProducto)
	{
		if(producto == null)
		{
			producto = (T)pProducto;
			return true;
		}
		return false;
	}

	public T darProducto()
	{
		return producto;
	}

	public T despachar()
	{
		if(producto==null)
		{
			return producto;
		}
		
		T nObjeto = producto;
		producto = null;
		return nObjeto;
	}

	public boolean estaDesocupado() {
		
		return producto == null;
		
	}

}
