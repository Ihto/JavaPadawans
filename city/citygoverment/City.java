public class City {

    private Building[] buildings;
    private String name;

    public City(String name) {
        this.name = name;
        buildings = new Building[100];
    }

    public Building[] getBuildings() {
        return buildings;
    }


    public void printBuildingsList() {
        for (Building building : buildings) {
            System.out.println("Building has size: " + building.getSquareMeter());
        }
    }

    public int getTax() {
        int totalTax = 0;
        for(Building a : buildings){
            totalTax = totalTax + a.getTax();
        }
        return totalTax;
    }
}
