package design.patterns.decorator;

public abstract class FaceAuthenticatorDecorator implements Authenticator{
	
	protected final Authenticator authenticator;
	
	public FaceAuthenticatorDecorator(Authenticator authenticator){
		this.authenticator = authenticator;
	}
	
	@Override
	public boolean isMatch() {
		return authenticator.isMatch();
	}
	
}
