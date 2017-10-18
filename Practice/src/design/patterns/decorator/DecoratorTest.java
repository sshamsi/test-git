package design.patterns.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		Authenticator faceAuthenticator = new FaceAuthenticator();
		Authenticator faceLivenessAuthenticator = new FaceLivenessAuthenticator(faceAuthenticator);
		
		System.out.println("Does face authenticator match ? "+faceAuthenticator.isMatch());
		System.out.println("Does face liveness authenticator match ? "+faceLivenessAuthenticator.isMatch());
		

	}

}
