package com.example.helloworld;

import net.woji.api.Plugin;
import net.woji.api.PluginContext;
import org.slf4j.Logger;

public class HelloWorldPlugin implements Plugin {
  PluginContext pluginContext;

  public void init(PluginContext pluginContext)
  {
    this.pluginContext = pluginContext;
  }

  public void onLoad() {
    Logger log = pluginContext.getLogger();
    log.info("Hello from HelloWorldPlugin!");
  }
  public void onEnable() {}
  public void onDisable() {}
}
