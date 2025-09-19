
package listas;

public class ListaSimplementeLigadaCircular {
   private Nodo Punta;

    public ListaSimplementeLigadaCircular() {
        Punta = null;
    }

    public Nodo getPunta() {
        return Punta;
    }

    public void setPunta(Nodo Punta) {
        this.Punta = Punta;
    }
public void MostrarDato()
{
    Nodo p = Punta;
    if(Punta == null)
    {
         System.out.println("La Lista esta vacia");
    }
    else
    {
        do
        {
            System.out.println(p.getDato();
             p=p.getEnlace();
        }While(p!=Punta);
        }
    }
    
}
   public void InsertarInicio(int dato)
   {
    Nodo x = new Nodo(dato);
    Nodo p = Punta;
    
    if(Punta != null)
    {
         x.setEnlace(Punta);   
         do{
             
          p = p.getEnlace();
         }While(p.getEnlace()!= Punta);
         p.setEnlace(x);
        x.setEnlace(Punta);
Punta = x;
         }
else
{
p.setEnlace(Punta);
}
    
Punta = x;
   }
   
}
   public void InsertarFinal( int dato)
   {  
   Nodo x = new Nodo (dato);
   Nodo p = Punta;
   if( Punta == null)
   {
Punta = x;
}
else
{
do{
p = p.getEnlace();
}while(p.getEnlace()!= punta);
p.setEnlace(x);

} 
   x.setEnlace(Punta);
}
