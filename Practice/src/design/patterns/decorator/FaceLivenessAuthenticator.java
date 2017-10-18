package design.patterns.decorator;

public class FaceLivenessAuthenticator extends FaceAuthenticatorDecorator{

	public FaceLivenessAuthenticator(Authenticator authenticator) {
		super(authenticator);
	}
	
	@Override
	public boolean isMatch() {
		return super.isMatch() && isLive();
	}
	
	private boolean isLive(){
		return false;
	}

}
