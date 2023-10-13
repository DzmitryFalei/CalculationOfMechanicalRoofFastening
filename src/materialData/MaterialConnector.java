package materialData;

public class MaterialConnector implements Material{

    @Override
    public int[] getIdList() {
        return new int[0];
    }

    @Override
    public String getName(int id) {
        return null;
    }

    @Override
    public int getTensileStrength(int id) {
        return 0;
    }

    @Override
    public int getTearResistance(int id) {
        return 0;
    }

    @Override
    public boolean setName(String name) {
        return false;
    }

    @Override
    public boolean setTensileStrength(int id, int tensileStrength) {
        return false;
    }

    @Override
    public boolean setTearResistance(int id, int tearResistance) {
        return false;
    }
}
