package q40;

import java.util.List;
import java.util.Map;

public record Group(Map<Color, List<Rope>> map1,
                    Map<Integer, List<Rope>> map2) {
}
