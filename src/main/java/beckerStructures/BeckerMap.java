package beckerStructures;

public class BeckerMap<KT, RT> {
    private BeckerList<MapNode> nodes;

    public BeckerMap(){
        nodes = new BeckerList<>();
    }
    public RT get(KT key){
        nodes.toFirst();
        while(nodes.hasAccess()){
            MapNode node = nodes.getContent();
            if(node.compareKey(key)){
                return node.getObject();
            }
            nodes.next();
        }
        return null;
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
