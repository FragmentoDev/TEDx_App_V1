package com.fernandoalberto.tedxcompanion;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

public class Splash extends AppCompatActivity {

    private final int Duracion= 3200;
    ImageView logo, fragmento, creditosizq, creditosder;
    TextView texto, elaborado;
    ProgressBar progreso;
    static ArrayList<Conferencistas> listaConferencistas = new ArrayList<Conferencistas>();
    static ArrayList<Conferencistas> listaClick = new ArrayList<Conferencistas>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash);

        logo= findViewById(R.id.splashlogotedx);
        texto= findViewById(R.id.splash_texto);
        progreso= findViewById(R.id.spalshProgressbar);
        elaborado= findViewById(R.id.splash_texto_elaborado);
        fragmento= findViewById(R.id.spashfragmento);
        creditosizq= findViewById(R.id.splashcontactosizq);
        creditosder= findViewById(R.id.splashcontactosder);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);

        logo.setAnimation(myanim);
        texto.setAnimation(myanim);
        progreso.setAnimation(myanim);
        elaborado.setAnimation(myanim);
        fragmento.setAnimation(myanim);
        creditosizq.setAnimation(myanim);
        creditosder.setAnimation(myanim);

        listaConferencistas.clear();
        listaConferencistas.add(new Conferencistas("Mirna Medina", "Activista Social", "Licenciada en Educación. Fundadora y directora del grupo “LasRastreadoras del Fuerte”. Taller de aplicación de ciencias forenses en la búsqueda de desaparecidos en Guatemala Defensora de los derechos humanos en México.","-" , "-"));
        listaConferencistas.add(new Conferencistas("Alejandro Félix", "Empresario", "Empresario dueño y fundador de Boki sushi, marisquería cocolobampo. Presidente de grupo EMUS. Consejero de Canirac y canacintra Los Mochis.","-" , "-"));
        listaConferencistas.add(new Conferencistas("Miguel Ángel Vicente Renteria", "Licenciado en Economía", "Originario del estado de Sinaloa es un \"Licenciado en Economía, Derecho\" y actualmente es un asesor de asistencia legislativa para el congreso del estado de Sinaloa. Se autoconsidera un amante del planeta pues su voluntario en greenpeace sinaloa lo avala, es encargado de promover diferentes iniciativas en el congreso se Sinaloa para promover los derechos de las mujeres.","-" , "-"));
        listaConferencistas.add(new Conferencistas("Ana Retamoza", "Emprendedora", "Estudiante de preparatoria. Medalla de oro en el concurso latinoamericano de computo. Embajadora de my world mexico en Sinaloa. Reconocida por la empresa latina Nerds como mujer emprendedora más sobresaliente. Primer lugar en la Feira de Ciências e Engenharia do Estado do Amapá, Brasil. Creadora de un sistema educativo basado en el desarrollo sustentable de la agenda 2030.","-" , "-"));
        listaConferencistas.add(new Conferencistas("Gerardo López Romero", "Ingeniero en Diseño Digital", "Ingeniero en Diseño Digital, maestro en educación, neurocognición, aprendizaje y desarrollo humano. Especialista en diseño y desarrollo de proyectos educativos y museografía en las áreas culturales.","-" , "-"));
        listaConferencistas.add(new Conferencistas("Mariela Guadalupe Hernández", "Ingeniera Industrial", "Ingeniera industrial con especialidad en logística. Docente de universidad. Supervisora de almacenaje y logística. Emprendedora. Certificación en metrología básica de la administración de proyectos. Defensora de los derechos de la mujer y feminista.","-" , "-"));
        listaConferencistas.add(new Conferencistas("Luis Daniel Cordero Escobedo", "Licenciado en Psicología", "Licenciado en psicología experto en procesos digitales, coordinador de eventos masivos, promotor cultural y marketing psicológico. Un mochitense comprometido con fomentar el arte y cultura de su ciudad de diferentes formas, creador de identidad para la ciudad y comprometido en aprovechar al máximo las infraestructuras con las que la ciudad cuenta para explotar al máximo su potencial.","-" , "-"));
        listaConferencistas.add(new Conferencistas("Krishna Daniela Valdez Ramírez", "Pintora", "Es una pintora mexicana que con tan solo 19 años a logrado romper las barreras que la vida le a propuesto, una de las jóvenes promesas del arte en México, sus obras han sido galardonadas en todo el mundo en diferentes estacias como lo son en : \n" +
                "Tokyo International Photo Awards Winners en 2018. \n" +
                "The Exposure Award Collection, Museo De Louvre. \n" +
                "Por mencionar algunas de las exposiciones que ha realizado, sin mencionar la cantidad de conferencias y talleres que ha impartido en todo el mundo divulgando su arte.","-" , "-"));
        listaConferencistas.add(new Conferencistas("María Stone", "Médica Cirujana", "Medica cirujana con especialidad en otorrinolaringología y geriatría. Escritora de 3 libros en circulación. Presidenta honorario de la asociación gerontológica y geriatría de Sinaloa AC. Presidenta de la asociación Alzheimer Sinaloa AC.","-" , "-"));
        listaConferencistas.add(new Conferencistas("Hector Serrano Castro", "Ingeniero en Negocios Internacionales", "Ingeniero en Negocios Internacionales, es un sinaloense apasionado por la información y la divulgación, esto mismo lo llevó a crear Vicious. \n" +
                "Una plataforma cuyo fin es compartir información periodistica, realizando entrevistas, conferencias y contenido en redes. Además de ser inversionista en agronegocios fomentando el amor, respeto y la libertad de los individuos.","-" , "-"));
        listaConferencistas.add(new Conferencistas("Gilberto Castro", "Productor Musical", "Productor musical fundador y director de Black Rooster Producciones. Promotor del arte y la cultura. Creador de conceptos como el ROCK WAR y ayudarte. Bajista en “los espanta perros” apasionado por la música y el reggae.","-" , "-"));
        listaConferencistas.add(new Conferencistas("Ayesha Peraza", "Biotecnóloga", "Biotecnóloga, mamá emprendedora, amante de la ciencia y la educación. Creadora de \"Nature Kids Mx\" y \"Cultiva Orgánico Mx\" proyectos que buscan educar a los niños en temas relacionados con la ciencia y sustentabilidad. \n" +
                "La idea es inspirar a los niños a ser pequeños científicos con el súper poder de rescatar su planeta.","-" , "-"));
        listaConferencistas.add(new Conferencistas("Dylan Kenjiro", "Músico", "Músico, cantante, productor, compositor, y creador de contenido en internet que su trabajo y pasión lo han llevado a participar en muchas colaboraciones con músicos nacionales e internacionales. Ganador del concurso nacional de canciones por los derechos de los niños de la UNICEF, Dylan se encuentra actualmente en grabaciones de su primer material discográfico.","-" , "-"));


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, Duracion);
    }
}
