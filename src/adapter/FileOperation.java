package adapter;

import java.io.File;

/**
 * Created by aser on 2020/5/28
 * 默认适配器模式其实就是内部已经给了一些方法你可以重写这些方法然后做你要做的事情
 */
class FileOperation extends FileListensterAdapter {
    @Override
    public void onCreateFile(File file) {
        super.onCreateFile(file);
        //可以做一些事情
    }
}
