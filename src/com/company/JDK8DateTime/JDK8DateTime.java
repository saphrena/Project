package JDK8DateTime;

/*
2.1 JDK8新增日期类
 JDK8新增日期类 (理解)
+ LocalDate       表示日期（年月日）
+ LocalTime       表示时间（时分秒）
+ LocalDateTime    表示时间+ 日期 （年月日时分秒）

 2.2 LocalDateTime创建方法 (应用)
+ 方法说明
  | 方法名                                                    | 说明                                              |
  | --------------------------------------------------------- | ------------------------------------------------- |
  | public static LocalDateTime now()                         | 获取当前系统时间                                  |
  | public static LocalDateTime of  (年, 月 , 日, 时, 分, 秒) | 使用指定年月日和时分秒初始化一个LocalDateTime对象 |

+ 示例代码
  ```java
  public class JDK8DateDemo2 {
      public static void main(String[] args) {
          LocalDateTime now = LocalDateTime.now();
          System.out.println(now);

          LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 11, 11, 11, 11);
          System.out.println(localDateTime);
      }
  }
  ```

 2.3 LocalDateTime获取方法 (应用)

+ 方法说明

  | 方法名                          | 说明                        |
  | ------------------------------- | --------------------------- |
  | public int getYear()            | 获取年                      |
  | public int getMonthValue()      | 获取月份（1-12）            |
  | public int getDayOfMonth()      | 获取月份中的第几天（1-31）  |
  | public int getDayOfYear()       | 获取一年中的第几天（1-366） |
  | public DayOfWeek getDayOfWeek() | 获取星期                    |
  | public int getMinute()          | 获取分钟                    |
  | public int getHour()            | 获取小时                    |

  ### 2.4 LocalDateTime转换方法 (应用)

+ 方法说明

  | 方法名                           | 说明                      |
  | -------------------------------- | ------------------------- |
  | public LocalDate  toLocalDate () | 转换成为一个LocalDate对象 |
  | public LocalTime toLocalTime ()  | 转换成为一个LocalTime对象 |



### 2.5 LocalDateTime格式化和解析 (应用)

+ 方法说明

  | 方法名                                                    | 说明                                                        |
  | --------------------------------------------------------- | ----------------------------------------------------------- |
  | public String format (指定格式)                           | 把一个LocalDateTime格式化成为一个字符串                     |
  | public LocalDateTime parse (准备解析的字符串, 解析格式)   | 把一个日期字符串解析成为一个LocalDateTime对象               |
  | public static DateTimeFormatter ofPattern(String pattern) | 使用指定的日期模板获取一个日期格式化器DateTimeFormatter对象 |


  ### 2.6 LocalDateTime增加或者减少时间的方法 (应用)

+ 方法说明

  | 方法名                                         | 说明           |
  | ---------------------------------------------- | -------------- |
  | public LocalDateTime plusYears (long years)    | 添加或者减去年 |
  | public LocalDateTime plusMonths(long months)   | 添加或者减去月 |
  | public LocalDateTime plusDays(long days)       | 添加或者减去日 |
  | public LocalDateTime plusHours(long hours)     | 添加或者减去时 |
  | public LocalDateTime plusMinutes(long minutes) | 添加或者减去分 |
  | public LocalDateTime plusSeconds(long seconds) | 添加或者减去秒 |
  | public LocalDateTime plusWeeks(long weeks)     | 添加或者减去周 |

  ### 2.7 LocalDateTime减少或者增加时间的方法 (应用)

+ 方法说明

  | 方法名                                          | 说明           |
  | ----------------------------------------------- | -------------- |
  | public LocalDateTime  minusYears (long years)   | 减去或者添加年 |
  | public LocalDateTime  minusMonths(long months)  | 减去或者添加月 |
  | public LocalDateTime minusDays(long days)       | 减去或者添加日 |
  | public LocalDateTime minusHours(long hours)     | 减去或者添加时 |
  | public LocalDateTime minusMinutes(long minutes) | 减去或者添加分 |
  | public LocalDateTime minusSeconds(long seconds) | 减去或者添加秒 |
  | public LocalDateTime minusWeeks(long weeks)     | 减去或者添加周 |

  ### 2.8 LocalDateTime修改方法 (应用)

+ 方法说明

  | 方法名                                              | 说明                           |
  | --------------------------------------------------- | ------------------------------ |
  | public LocalDateTime withYear(int year)             | 直接修改年                     |
  | public LocalDateTime withMonth(int month)           | 直接修改月                     |
  | public LocalDateTime withDayOfMonth(int dayofmonth) | 直接修改日期(一个月中的第几天) |
  | public LocalDateTime withDayOfYear(int dayOfYear)   | 直接修改日期(一年中的第几天)   |
  | public LocalDateTime withHour(int hour)             | 直接修改小时                   |
  | public LocalDateTime withMinute(int minute)         | 直接修改分钟                   |
  | public LocalDateTime withSecond(int second)         | 直接修改秒                     |

  ### 2.9 Period (应用)

+ 方法说明

  | 方法名                                          | 说明                 |
  | ----------------------------------------------- | -------------------- |
  | public static Period between(开始时间,结束时间) | 计算两个“时间"的间隔 |
  | public int getYears()                           | 获得这段时间的年数   |
  | public int getMonths()                          | 获得此期间的总月数   |
  | public int getDays()                            | 获得此期间的天数     |
  | public long toTotalMonths()                     | 获取此期间的总月数   |

  ### 2.10 Duration (应用)

+ 方法说明

  | 方法名                                           | 说明                 |
  | ------------------------------------------------ | -------------------- |
  | public static Durationbetween(开始时间,结束时间) | 计算两个“时间"的间隔 |
  | public long toSeconds()                          | 获得此时间间隔的秒   |
  | public int toMillis()                            | 获得此时间间隔的毫秒 |
  | public int toNanos()                             | 获得此时间间隔的纳秒 |
*/