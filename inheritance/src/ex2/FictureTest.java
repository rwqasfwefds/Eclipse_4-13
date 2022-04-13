package ex2;

public class FictureTest {
	
	public static void main(String[] args) {
		Dslr dslr = new Dslr();
		FilmCamera filmCamera = new FilmCamera();
		
		dslr.takePicture();
		filmCamera.takePicture();
		
		dslr.extraPicture();
		filmCamera.smallPicture();
	}
}
