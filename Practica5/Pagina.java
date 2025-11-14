public class Pagina {
    private int numeroPagina;
    private String contenido_de_pagina;
    public Pagina(int numeroPagina, String contenido_de_pagina){
        this.numeroPagina=numeroPagina;
        this.contenido_de_pagina=contenido_de_pagina;
    }
    public void mostrarcontenido(){
        System.out.println("numero de pagina: "+numeroPagina+" contenido de pagina: "+contenido_de_pagina);
    }

}
