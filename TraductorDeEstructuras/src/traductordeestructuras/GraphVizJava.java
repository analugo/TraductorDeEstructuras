package traductordeestructuras;

public class GraphVizJava {
    public static void main( String []arg ){
		new GraphVizJava( arg[0], arg[1] );
	}
	
	public GraphVizJava( String DireccionDot, String DireccionPng ){
		Dibujar( DireccionDot, DireccionPng );
	}
	
	public void Dibujar( String direccionDot, String direccionPng ){
		try
		{       
			ProcessBuilder pbuilder;
			pbuilder = new ProcessBuilder( "dot", "-Tpng", "-o", direccionPng, direccionDot );
			pbuilder.redirectErrorStream( true );
			pbuilder.start();
		    
		} catch 
                        (Exception e) { e.printStackTrace(); }
	}
}
