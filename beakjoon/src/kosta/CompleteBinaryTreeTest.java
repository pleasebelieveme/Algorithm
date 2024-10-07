package kosta;

public class CompleteBinaryTreeTest {
    public static void main(String[] args) {
        /*
                      김재영(1)
            이인영(2)              김태휘(3)
        최성준(4)   주영준(5)   한은미(6)
         */
        CompleteBinaryTree<String> tree = new CompleteBinaryTree<>(10);
        String[] names = {"김재영", "이인영", "김태휘", "최성준", "주영준", "한은미"};
        for (String name : names) {
            tree.add(name);
        }


        System.out.print("\n=====bfs=====");
        tree.bfs();
        System.out.print("\n=====preorder=====");
        tree.dfsByPreOrder(1);
        System.out.print("\n=====inorder=====");
        tree.dfsByInOrder(1);
        System.out.print("\n=====postorder=====");
        tree.dfsByPostOrder(1);
    }
}
