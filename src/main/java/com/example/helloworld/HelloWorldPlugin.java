package com.example.helloworld;

import net.woji.api.Plugin;
import net.woji.api.PluginContext;
import net.woji.api.event.ServerTickEvent;
import org.slf4j.Logger;

public class HelloWorldPlugin implements Plugin {
  private PluginContext pluginContext;
  private Logger logger;

  public void init(PluginContext pluginContext)
  {
    this.pluginContext = pluginContext;
    this.logger = pluginContext.getLogger();

    pluginContext.getEventBus().register(this);
  }

  public void onLoad() {

  }

  public void onEnable() {
    logger.info("HelloWorldPlugin enabled!");
  }
  public void onDisable() {
    logger.info("HelloWorldPlugin disabled!");
  }

  public void onTick(ServerTickEvent e) {
    if (e.getTick() % 100 == 0) {
      logger.info("Hello from HelloWorldPlugin!");
    }
  }
}
