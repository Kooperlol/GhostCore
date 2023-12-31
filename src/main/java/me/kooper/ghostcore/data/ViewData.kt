package me.kooper.ghostcore.data

import io.papermc.paper.math.Position
import org.bukkit.block.data.BlockData
import java.util.concurrent.ConcurrentHashMap

data class ViewData(val name: String, val blocks: ConcurrentHashMap<Position, BlockData>, var pos1: Position, var pos2: Position, var patternData: PatternData, var isBreakable: Boolean)
