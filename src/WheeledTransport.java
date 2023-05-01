public abstract class WheeledTransport implements  Serviceable{
    private String modelName;
    private int wheelsCount;

    public WheeledTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public abstract void updateTyre();
     @Override
     public void service (Mechanic mechanic) {
         System.out.println("Механик " + mechanic.getName() + " обслуживает колёса " + getModelName());
         for (int i = 0; i < getWheelsCount(); i++) {
             updateTyre();
         }
     }
}
