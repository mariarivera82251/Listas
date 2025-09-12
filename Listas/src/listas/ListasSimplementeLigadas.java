
package listas;

public class ListasSimplementeLigadas {
 private Nodo punta; 

    public ListasSimplementeLigadas() {
        punta = null;
        
    }

    public Nodo getPunta() {
        return punta;
    }

    public void setPunta(Nodo punta) {
        this.punta = punta;
    }
    
    public void MostrarDatos()
    {
        Nodo p = punta;
        if(punta == null)
        {
            System.out.println("La Lista esta vacia");
        }
      else
        {
            while(p!=null)
            {
                System.out.println(p.getDato());
                p = p.getEnlace();
                
            }
        }
    }
    
public void InsertarInicio(int dato)
{
    Nodo x = new Nodo(dato);
    if(punta != null)
    {
         x.setEnlace(punta);   
    }  
    punta = x;
    
   
}
public void InsertarFinal(int dato)
{  
   Nodo x = new Nodo (dato);
   Nodo p = punta;
   if(punta == null)
   {
   while(p.getEnlace()!=null)
   {
     p = p.getEnlace();
   }
   p.setEnlace(x);
   }
}      
}
