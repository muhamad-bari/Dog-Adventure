package bonkapp.dog.adventure;

import org.cocos2d.types.CGPoint;

import android.media.MediaPlayer;

public class G {

	public static float display_w;
	public static float display_h;
	public static float width;
	public static float height;
	public static float scale;
	
	public static boolean music;
	public static boolean sound;
	
	public static int gsPause = 0;
	public static int gsReady = 1;
	public static int gsRun = 2;
	
	public static float normalVx = 7;
	public static float fastVx = 2*normalVx;
	public static float gravity = 432.0f*normalVx*normalVx/180.0f/180.0f;
	public static float jumpVy = (180.0f*gravity+0.1f)/normalVx;
	
	public static MediaPlayer bgSound;
	public static MediaPlayer soundMenu;
	public static MediaPlayer soundGame;
	public static MediaPlayer soundCollide;
	public static MediaPlayer soundJump;
	public static MediaPlayer soundLongJump;
	public static MediaPlayer soundSpeedDown;
	public static MediaPlayer soundSpeedUp;
	public static MediaPlayer soundDirection;
	public static MediaPlayer soundClick;
	public static MediaPlayer soundCollect;
		
	public static CGPoint displayCenter()
	{
		return CGPoint.ccp(width/2, height/2);
	}
	
}
