
/**
 * Klasse Ball zum Erkunden von Attributen und Methoden
 * 
 * @author      mike_gans@yahoo.de
 * 
 * @version     4.0 (2018-08-07)
 * 
 */
public class Ball 
    extends KREIS
{
    private float reibung;
    
    private float elastizitaet;
    
    private float masse;
    
    private String farbe;

    
    /**
     * Konstruktor der Klasse Ball
     * 
     * @param   x   x-Koordinate des Mittelpunkts
     * @param   y   y-Koordinate des Mittelpunkts
     */
    public Ball( float x , float y )
    {
        super( 25 );
        super.setzeFarbe( "blau");
        super.macheAktiv();
        this.masse = 1f;
        setzeMasse( this.masse );
        this.farbe = super.nenneFarbe();
        this.reibung = 0.1f;
        super.setzeReibung( this.reibung );
        this.elastizitaet = 0.5f;
        super.setzeElastizitaet( this.elastizitaet );
        super.setzeMittelpunkt( x , y );
    }
    
    
    /**
     * Konstruktor der Klasse Ball
     *
     * @param   kg      Masse des Balls in kg
     * @param   radius  Radius des Balls in Pixel am Bildschirm
     */
    public Ball ( int radius )
    {
        this( 0 , 100 );
        super.setzeRadius( radius );
        super.macheAktiv();
        this.elastizitaet = 0.5f;
        super.setzeElastizitaet( this.elastizitaet );
        this.reibung = 0.1f;
        super.setzeReibung( this.reibung );
    }

    
    /**
     * Legt den Ball an den entsprechenden Koordinaten ab.
     *
     * @param   x   x-Koordinate
     * @param   y   y-Koordinate
     */
    public void setzeMittelpunkt( float x , float y )
    {
        super.setzeGeschwindigkeit( 0 , 0 );
        super.setzeMittelpunkt( x , y );
    }
    
    
    /**
     * Setzt die Geschwindigkeit des Balls auf einen bestimmten Wert. 
     * Liegt der Ball still, so entspricht das einem "Tritt" in diese Richtung.
     *
     * @param   inXrichtung     Geschwindigkeit in x-Richtung
     * @param   inYrichtung     Geschwindigkeit in y-Richtung
     */
    public void setzeGeschwindigkeit( float inXrichtung , float inYrichtung )
    {
        //this.geschwindigkeitX = inXrichtung;
        //this.geschwindigkeitY = inYrichtung;
        super.setzeGeschwindigkeit( inXrichtung , inYrichtung );
    }
    
    
    /**
     * Nennt die aktuelle Geschwindigkeit in x-Richtung. 
     *
     * @return      aktuelle Geschwindigktei in x-Richtung
     */
    public float nenneGeschwindigkteiX()
    {
        //this.geschwindigkeitX = super.nenneVx();
        //this.geschwindigkeitY = super.nenneVy();
        return super.nenneVx();
    }
    
    
    /**
     * Nennt die aktuelle Geschwindigkeit in y-Richtung. 
     *
     * @return      aktuelle Geschwindigktei in y-Richtung
     */
    public float nenneGeschwindigkteiY()
    {
        //this.geschwindigkeitX = super.nenneVx();
        //this.geschwindigkeitY = super.nenneVy();
        return super.nenneVy();
    }
    
    
    /**
     * Setzt den Reibungs-Koeffizienten des Balls beim Rollen auf dem Boden. 
     *
     * @param   reibungsKoeffizient     0=keine Reibung ; 0.5=standard
     */
    public void setzeReibung( float reibungsKoeffizient )
    {
        this.reibung = reibungsKoeffizient;
        super.setzeReibung( reibungsKoeffizient );
    }
    
    
    /**
     * Gibt den aktuellen Reibungs-Koeffizienten des Balls zurueck. 
     *
     * @return      aktueller Reibungs-Koeffizienten des Balls
     */
    public float nenneReibung()
    {
        return this.reibung;
    }
    
    
    /**
     * Setzt die Elastizitaet des Balls auf eienen bestimmten Wert. 
     * 
     *
     * @param   elastizitaetsKonstante  0 = steinhart ; 0.5 = standard ; 1 = reibungsfreier Gummihuepfer
     */
    public void setzeElastizitaet( float elastizitaetsKonstante )
    {
        this.elastizitaet = elastizitaetsKonstante;
        super.setzeElastizitaet( elastizitaetsKonstante );
    }
    
    
    /**
     * Gibt die aktuelle Elastizitaets-Konstante des Balls zurueck. 
     *
     * @return      aktuelle Elastizitaets-Konstante des Balls
     */
    public float nenneElastizitaet()
    {
        return this.elastizitaet;
    }
    
    
    /**
     * Setzt die Masse des Balls in kg
     *
     * @param   kg      neue Masse des Balls
     */
    public void setzeMasse( float kg )
    {
        this.masse = kg;
        super.setzeMasse( kg );
    }
    
    
    /**
     * Nennt die aktuelle Masse des Balls
     *
     * @return      aktuelle Masse des Balls
     */
    public float nenneMasse()
    {
        return this.masse;
    }
    
    
    public void setzeFarbe( String farbe )
    {
        this.farbe = farbe;
        super.setzeFarbe( farbe );
    }
}
