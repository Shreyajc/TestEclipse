package a;

class Bank{
	float getROI() {
		return 0.f;
		
	}
}

class Axix extends Bank{
	@Override
	float getROI() {
		return 4.0f;
	}
}

public class Main1 {
public static void main(String[] args) {
	Bank bank;
}
}
