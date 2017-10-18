package design.patterns.decorator;

public class FaceAuthenticator implements Authenticator{

	@Override
	public boolean isMatch() {
		return true;
	}

}
