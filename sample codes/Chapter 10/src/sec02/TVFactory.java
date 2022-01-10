package sec02;

class TVFactory {

	public TV getTV(String tvName) {
		if(tvName.equals("A")) {
			return new S_TV();
		} else if(tvName.equals("B")) {
			return new L_TV();
		}
		
		return null;
	}

}
