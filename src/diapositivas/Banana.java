package diapositivas;

import com.sun.j3d.loaders.IncorrectFormatException;
import com.sun.j3d.loaders.ParsingErrorException;
import com.sun.j3d.loaders.Scene;
import com.sun.j3d.loaders.objectfile.ObjectFile;
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import com.sun.j3d.utils.image.TextureLoader;
import com.sun.j3d.utils.universe.SimpleUniverse;
import java.io.*;
import javax.media.j3d.*;
import javax.vecmath.*;

/**
 *
 * @author JCode
 */
public class Banana extends Applet {
    private static final long serialVersionUID = 1L;
    
    public Banana(String filename){
        // Se crea un nuevo universo
        setLayout(new BorderLayout());
        GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
        Canvas3D c = new Canvas3D(config);
        add("Center",c);
        
        // Se inicializa la escena
        BranchGroup escena = crearescenaG(filename);
        SimpleUniverse u = new SimpleUniverse(c);
        u.getViewingPlatform().setNominalViewingTransform();
        u.addBranchGraph(escena);
    }
    
    BoundingBox limites = new BoundingBox(new Point3d(-100,-100,-100),new Point3d(100,100,100));
    
    public BranchGroup crearescenaG(String filename){
        BranchGroup escenaRoot = new BranchGroup();
        escenaRoot.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        escenaRoot.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        escenaRoot.addChild(dibujarfondo());
        
        // Se definen las luces del ambiente
        Color3f luz1Color = new Color3f(1.0f,1.0f,0.9f);
        Vector3f luz1Direccion = new Vector3f(4.0f,-7.0f,-12.0f);
        Color3f luz2Color = new Color3f(0.3f,0.3f,0.4f);
        Vector3f luz2Direccion = new Vector3f(-6.0f,-2.0f,-1.0f);
        Color3f ambienteColor = new Color3f(0.1f,0.1f,0.1f);
        
        AmbientLight Nodoambienteluces = new AmbientLight(ambienteColor);
        Nodoambienteluces.setInfluencingBounds(limites);
        escenaRoot.addChild(Nodoambienteluces);
        
        // Configurar la dirección de las luces
        DirectionalLight luz1 = new DirectionalLight(luz1Color,luz1Direccion);
        luz1.setInfluencingBounds(limites);
        escenaRoot.addChild(luz1);
        
        DirectionalLight luz2 = new DirectionalLight(luz2Color,luz2Direccion);
        luz2.setInfluencingBounds(limites);
        escenaRoot.addChild(luz2);
        
        TransformGroup escenaTG = new TransformGroup();
        escenaTG.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        escenaRoot.addChild(escenaTG);
        
        Alpha rotacionAlpha = new Alpha(-1, Alpha.INCREASING_ENABLE | Alpha.DECREASING_ENABLE, 0, 0, 3500, 6000, 26, 1500, 2000, 26);
        
        Transform3D yAxis = new Transform3D();
        RotationInterpolator rotar = new RotationInterpolator(rotacionAlpha,escenaTG,yAxis,0.0f,(float) Math.PI*2.0f);
        rotar.setSchedulingBounds(limites);
        escenaTG.addChild(rotar);
        
        // Cargar el elemento .OBJ
        TransformGroup objTG = new TransformGroup();
        Transform3D objTrans = new Transform3D();
        objTG.getTransform(objTrans);
        objTrans.setTranslation(new Vector3d(0.0,0.2,0.0));
        objTrans.setScale(0.26);
        objTG.setTransform(objTrans);
        
        escenaTG.addChild(objTG);
        
        int flags = ObjectFile.RESIZE;
        ObjectFile file = new ObjectFile(flags,(float)(49.0*Math.PI/180.0));
        
         Scene s = null;
        
        try{
           s = file.load(filename == null ? "images\\Banana\\Banana.obj" : filename);
        }
        catch (FileNotFoundException | ParsingErrorException | IncorrectFormatException e){
            System.err.println(e);
            System.exit(1);
        }
        
        objTG.addChild(s.getSceneGroup());
        return escenaRoot;
    }
    
    private TransformGroup dibujarfondo(){
        TransformGroup fondo = new TransformGroup();
        TextureLoader espacio = new TextureLoader("diapositivas\\Diapositiva6.PNG",this);
        Background back = new Background();
        back.setImage(espacio.getImage());
        back.setImageScaleMode(Background.SCALE_FIT_MIN);
        back.setApplicationBounds(limites);
        fondo.addChild(back);
        
        return fondo;
    }
}
