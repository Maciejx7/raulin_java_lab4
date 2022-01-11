public class Prostokat extends Figura {
    @Override
    int getPole1(int pole, int pole1) {
        return pole * pole1;
    }

    @Override
    int getObw1(int pole, int pole1) {
        return pole + pole1;
    }
}