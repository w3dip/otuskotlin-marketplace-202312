# deploy

## Настройка

Для корректного запуска файлов, необходимо добавить в настройки ядра Linux следующий параметр:

**/etc/sysctl.d/20-opensearch.conf:**

```
vm.max_map_count = 262144
```
