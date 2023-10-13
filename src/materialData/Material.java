package materialData;

public interface Material {
    public int[] getIdList();
    public String getName(int id);
    public int getTensileStrength(int id);
    public int getTearResistance(int id);
    public boolean setName(String name);
    public boolean setTensileStrength(int id, int tensileStrength);
    public boolean setTearResistance(int id, int tearResistance);
}
