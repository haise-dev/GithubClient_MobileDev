Tao đã thêm phần drag and drop cho các mục trong My Work ở Home.

- Tao đã thay RelativeLayout chứa các mục trong My Work thành RecycleView để linh hoạt hơn trong drag and drop.
- Vì chuyển sang RecycleView nên tao đã phải tạo thêm 3 file: +, AdapterforHomedrag.java 
                                                              +, Item.java 
                                                              +, item_layout_for_home.xml
- Sau khi tạo thêm 3 file và 1 chút thay đổi trong HomeFragment.java và fragment_home.java 
thì tao đã có thể di chuyển đổi vị trí của các mục trong My Work mà vẫn đảm chức năng không bị thay đổi.