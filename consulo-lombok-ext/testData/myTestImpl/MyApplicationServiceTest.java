package myTestImpl;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import myTest.MyApplicationService;
import myTest.MyModuleService;
import myTest.MyProjectService;

/**
 * User: VISTALL
 * Date: 03.06.13
 * Time: 19:58
 */
public class MyApplicationServiceTest {
    public static void main(String[] args) {
        MyApplicationService.getInstance().testCall();
        MyModuleService.getInstance(new Module()).call();
        MyProjectService.getInstance(new Project()).test();
    }
}