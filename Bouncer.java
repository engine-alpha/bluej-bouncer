
/**
 * Klasse Bouncer zum Erkunden der Eigenschaften 'Elastizitaet', 'Reibung'.
 * 
 * @author      mike_gans@yahoo.de
 * 
 * @version     4.0 (2018-08-07)
 */
public class Bouncer
extends SPIEL
{
    public RECHTECK boden;
    
    public Ball ball;
    

    /**
     * Konstruktor der Klasse Bouncer
     */
    public Bouncer()
    {
        SPIEL.zeigeKoordinatensystem( true );
        super.setzeHintergrundgrafik( "hintergrund.png" );        
        this.boden = new RECHTECK( 1500 , 50 );
        this.boden.setzeMittelpunkt( 0 , -250 );
        this.boden.setzeFarbe( "gelb" );
        this.boden.machePassiv();
        this.boden.setzeReibung( 0.1f );
        
        this.ball = new Ball( 0 , 250 );
        this.ball.setzeFarbe( "blau" );
        this.ball.setzeMittelpunkt( 0 , 250 );
        this.ball.macheAktiv();
        
        SPIEL.warte( 6000 );
        this.ball.setzeGeschwindigkeit( -5, 0 );
        SPIEL.warte( 6000 );
        this.ball.setzeGeschwindigkeit( 5 , 15 );
    }

    
    /**
     * Damit kann man das Koordinatensystem ein-/aus-blenden. 
     *
     * @param   zeigen      'true'=zeigen ; 'false'=ausblenden 
     */
    public static void zeigeKoordinatensystem( boolean zeigen )
    {
        SPIEL.zeigeKoordinatensystem( zeigen );
    }
    
    
    @Override 
    public void tick()
    {
        // nichts tun
    }
    
    
    public void animationNeu()
    {
        this.ball.setzeFarbe( "blau" );
        this.ball.setzeMittelpunkt( 0 , 250 );this.ball.macheAktiv();
        
        SPIEL.warte( 6000 );
        this.ball.setzeGeschwindigkeit( -5, 0 );
        SPIEL.warte( 6000 );
        this.ball.setzeGeschwindigkeit( 5 , 15 );
    }
}
