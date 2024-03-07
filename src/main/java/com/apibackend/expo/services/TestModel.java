// package com.apibackend.expo.services;

// import javax.swing.JFrame;
// import javax.media.j3d.*;
// import javax.swing.*;
// import java.awt.*;
// import java.awt.image.*;
// import com.sun.j3d.utils.universe.*;
// import com.sun.j3d.utils.image.*;

// public class TestModel {
//      public static void main(String[] args) {
//         JFrame frame = new JFrame("Java 3D Example");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(800, 600);

//         // Création d'un Canvas3D
//         Canvas3D canvas = new Canvas3D(SimpleUniverse.getPreferredConfiguration());
//         frame.getContentPane().add(canvas, BorderLayout.CENTER);

//         // Création d'un SimpleUniverse et ajout du Canvas3D
//         SimpleUniverse universe = new SimpleUniverse(canvas);
//         BranchGroup group = new BranchGroup();
//         TransformGroup tg = new TransformGroup();
//         tg.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
//         group.addChild(tg);
        
//         // Chargement de l'image
//         BufferedImage image = ImageLoader.loadImage("chemin_vers_votre_image.jpg");

//         // Création d'un Appearance
//         Appearance appearance = new Appearance();
//         Texture texture = new TextureLoader(image).getTexture();
//         appearance.setTexture(texture);

//         // Création d'une Shape3D avec un QuadArray
//         QuadArray quadArray = new QuadArray(4, QuadArray.COORDINATES | QuadArray.TEXTURE_COORDINATE_2);
//         quadArray.setCoordinate(0, new Point3f(-1.0f, -1.0f, 0.0f));
//         quadArray.setCoordinate(1, new Point3f( 1.0f, -1.0f, 0.0f));
//         quadArray.setCoordinate(2, new Point3f( 1.0f,  1.0f, 0.0f));
//         quadArray.setCoordinate(3, new Point3f(-1.0f,  1.0f, 0.0f));
//         quadArray.setTextureCoordinate(0, 0, new TexCoord2f(0.0f, 0.0f));
//         quadArray.setTextureCoordinate(0, 1, new TexCoord2f(1.0f, 0.0f));
//         quadArray.setTextureCoordinate(0, 2, new TexCoord2f(1.0f, 1.0f));
//         quadArray.setTextureCoordinate(0, 3, new TexCoord2f(0.0f, 1.0f));
//         Shape3D shape = new Shape3D(quadArray, appearance);
//         tg.addChild(shape);

//         // Ajout du groupe à l'univers
//         group.addChild(tg);
//         universe.addBranchGraph(group);

//         // Affichage de la frame
//         frame.setVisible(true);
//     }
// }
