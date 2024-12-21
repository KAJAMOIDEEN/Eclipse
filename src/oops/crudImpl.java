package oops;

class crudImpl implements crud {

	public void create() {
		System.out.println("created");
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crudImpl obj = new crudImpl();
		obj.read();

	}

}
