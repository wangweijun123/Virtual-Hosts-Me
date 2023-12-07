## Virtual Hosts
hosts for android,implement by vpn mode,supports wildcard DNS records

<a href="https://play.google.com/store/apps/details?id=com.github.xfalcon.vhosts"><img src="https://play.google.com/intl/en_us/badges/images/generic/en-play-badge.png" height="48" /></a>
<a href="https://f-droid.org/packages/com.github.xfalcon.vhosts"><img src="https://fdroid.gitlab.io/artwork/badge/get-it-on.png" alt="Get it on F-Droid" height="48"></a>


Video Demo: <a target="_blank" href="https://www.youtube.com/watch?v=pHnsboAnm-A">https://www.youtube.com/watch?v=pHnsboAnm-A</a>

Virtual Hosts  app helping developers customized  hosts(/system/etc/hosts) File on android devices(no root).

support wildcard DNS records.For example:
```
127.0.0.1 a.com     |
127.0.0.1 m.a.com   |  => 127.0.0.1 .a.com
127.0.0.1 w.m.a.com |
```   



### OPEN SOURCE LICENSES

<ul>
    <li>LocalVPN: <a href="https://github.com/hexene/LocalVPN/blob/master/README.md">APL 2.0</a></li>
</ul>



#### LICENSE

Copyright (C) 2017  xfalcon

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.


VPNRunnable             com.github.xfalcon.vhosts            W  Unknown packet type
DnsChange               com.github.xfalcon.vhosts            D  query: 1 :www.a.com.
DnsChange               com.github.xfalcon.vhosts            D  hit: 1 :www.a.com. :192.168.11.1
VPNRunnable             com.github.xfalcon.vhosts            W  Unknown packet type
DnsChange               com.github.xfalcon.vhosts            D  query: 28 :ccc.sys.miui.com.
DnsChange               com.github.xfalcon.vhosts            D  query: 1 :ccc.sys.miui.com.
VPNRunnable             com.github.xfalcon.vhosts            W  Unknown packet type
