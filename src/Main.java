public class Main {
    public static void main(String[] args){
        Blockchain blockchain = new Blockchain(4);
        blockchain.addBlock(blockchain.newBlock("Second block"));
        blockchain.addBlock(blockchain.newBlock("Third block"));
        blockchain.addBlock(blockchain.newBlock("Fourth block"));

        System.out.println("Are block valid :"+ blockchain.isBlockChainValid());
        System.out.println(blockchain);
    }
}
