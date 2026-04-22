package beckerStructures;

public class BeckerMap<KT, RT> {
    private BeckerList<MapNode> nodes;

    public BeckerMap(){

    }
    public RT get(KT key){
        while(false){ //TODO
            MapNode node = null;//TODO
            if(node.compareKey(key)){
                return node.getObject();
            }
        }
    }

    private class MapNode {
        KT key;
        RT object;
        public MapNode(KT key, RT object){
            this.object = object;
            this.key = key;
        }
        public boolean compareKey(KT key){
            return key.equals(this.key);
        }
        public RT getObject(){
            return object;
        }
    }
}
