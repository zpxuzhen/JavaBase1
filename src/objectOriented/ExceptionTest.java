package objectOriented;

/**
 * 异常分类:
 * (1)检查性异常:java.lang.Exception
 * 文件io/连接远程端口/线程  ...
 * (2)运行期异常:java.lang.RuntimeException
 * 数组越界/除零/参数不规范  ...
 * (3)错误:java.lang.Error
 * 程序bug/内存耗尽 ...
 */
/**
 * Java中2种异常处理方式:
 * (1)异常发生处直接处理
 * try ... catch(可以多个,没有顺序) ... finally(不一定执行)
 * (2)将异常抛给调用者,让调用者处理
 * throws (不建议)
 */
/**
 * finally 不一定执行 :
 * finally中发生了异常
 * 程序所在线程死亡
 * finally之前有System.exit()执行了
 * ...
 */
/* 一定要及时关闭资源 */

