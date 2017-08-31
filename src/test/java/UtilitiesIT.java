/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Inject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;

/**
 *
 * @author usuario
 */
public class UtilitiesIT {
    
    public static WebArchive desplega (){
        WebArchive salida=ShrinkWrap.create(WebArchive.class).addClass(Utilities.class)
                .addAsWebResource(EmptyAsset.INSTANCE,"beans.xml");
        System.out.println(salida.toString(true));
        return salida;
    }
    @Inject
private Utilities probando;

    @Test
public void probar_v01 (){
    String texto= "Bienvenidos a la materia de Programación 3 Ciclo II 2017";
    String resultado=probando.getResume(texto);
    Assert.assertEquals(texto, resultado);
}

@Test
public void probar_v02 (){
    String texto= "Hola Mundo";
    String resultado=probando.getResume(texto);
    Assert.assertEquals(texto, resultado);
}

@Test
public void probar_v03 (){
    String texto= null;
    String resultado=probando.getResume(texto);
    Assert.assertEquals(texto, resultado);
}

@Test
public void probando_v04 (){
    String texto="prueBas de UNIDAD con JUnit​& arQuillian";
    String resultado=probando.capitalizar(texto);
    Assert.assertEquals(texto, resultado);
}

@Test
public void probando_v05 (){
    String texto="";
    String resultado=probando.capitalizar(texto);
    Assert.assertEquals(texto, resultado);
}

@Test
public void probando_v06 (){
    String texto=null;
    String resultado=probando.capitalizar(texto);
    Assert.assertEquals(texto, resultado);
}

@Test
public void probando_v07(){
    String texto="Bienvenidos a la materia de Programación 3 Ciclo​II​2017";
    String frase="2017";
    String resultado=probando.contarCoincidencias(frase, texto);
    Assert.assertEquals(texto, resultado);
}

@Test
public void probando_v08(){
    String texto="Bienvenidos a la materia de Programación 3 Ciclo​II​2017";
    String frase="MA";
    String resultado=probando.contarCoincidencias(frase, texto);
    Assert.assertEquals(texto, resultado);
}
@Test
public void probando_v09(){
    String texto=null;
    String frase="Bienvenido";
    String resultado=probando.contarCoincidencias(frase, texto);
    Assert.assertEquals(texto, resultado);
}
    
}
