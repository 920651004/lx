package adapter;

import java.io.File;

/**
 * Created by aser on 2020/5/28
 * 默认适配器模式
 */
interface FileListenster {
    void onStart(FileListenster listenster);
    void onCreateFile(File file);
    void onChangeFile(File file);
    void onDeletleFile(File file);
    void onStop(FileListenster listenster);
}
