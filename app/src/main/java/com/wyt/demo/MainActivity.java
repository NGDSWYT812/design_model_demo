package com.wyt.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.wyt.demo.adapter.Phone;
import com.wyt.demo.builder.Builder;
import com.wyt.demo.builder.Computer;
import com.wyt.demo.builder.WinPcBuilder;
import com.wyt.demo.facade.Controller;
import com.wyt.demo.proxy.IDoSomethingDirty;
import com.wyt.demo.proxy.WhoreMaster;
import com.wyt.demo.template.LongTimeSex;
import com.wyt.demo.template.ShortTimeSex;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BuilderDemo();
        FacadeDemo();
        TemplateDemo();
        ProxyDemo();
        AdapterDemo();
    }

    private void AdapterDemo() {
        Phone phone = new Phone();
        phone.listenMusic();
        Log.e("wyt", "-----------------------");
    }

    private void TemplateDemo() {
        LongTimeSex longTimeSex = new LongTimeSex();
        longTimeSex.doWhatYouWant();
        ShortTimeSex shortTimeSex = new ShortTimeSex();
        shortTimeSex.doWhatYouWant();
        Log.e("wyt", "-----------------------");
    }

    private void FacadeDemo() {
        Controller controller = new Controller();
        controller.turnOn();
        controller.turnUp();
        controller.turnDown();
        controller.turnOff();
        Log.e("wyt", "-----------------------");
    }

    private void BuilderDemo() {
        Builder builder = new WinPcBuilder();
        Computer computer = builder.buildOs("windows")
                .buildRam(1024)
                .buildCpu(4)
                .create();
        Log.e("wyt", computer.toString());
        Log.e("wyt", "-----------------------");
    }

    private void ProxyDemo() {
        IDoSomethingDirty whore = new WhoreMaster();
        whore.whoredom();
        Log.e("wyt", "-----------------------");
    }
}
