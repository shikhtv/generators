/*
 * Copyright (c) bdew, 2014
 * https://github.com/bdew/generators
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://bdew.net/minecraft-mod-public-license/
 */

package net.bdew.generators.nei

import codechicken.nei.api.IConfigureNEI
import codechicken.nei.guihook.GuiContainerManager

class NEIGeneratorsConfig extends IConfigureNEI {
  override def loadConfig() {
    GuiContainerManager.addTooltipHandler(FuelTooltipHandler)
  }

  override def getName = "Advanced Generators"
  override def getVersion = "GENERATORS_VER"
}
