package icu.taoy.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import icu.taoy.entity.CommonResult;
import icu.taoy.entity.LayTableData;
import icu.taoy.entity.LayUser;
import icu.taoy.service.LayUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author javakiller宇
 */
@RestController
@RequestMapping("/layuser")
@SuppressWarnings("all")
public class LayUserController {

    @Autowired
    private LayUserService layUserService;

    @GetMapping("/get")
    public LayTableData<LayUser> queryLayUser(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "limit", defaultValue = "10") Integer limit,
            @RequestParam(value = "search", defaultValue = "") String search) {
        return layUserService.queryLayUsers(page, limit, search);
    }

    @PostMapping("/save")
    public CommonResult<Integer> saveLayUser(@RequestBody LayUser layUser) {
        layUserService.saveLayUser(layUser);
        if (!StringUtils.isEmpty(layUser.getId())) {
            return new CommonResult<>(200, "id：" + layUser.getId() + "信息保存成功", layUser.getId());
        }
        return new CommonResult<>(500, "id：" + layUser.getId() + "信息保存失败", null);
    }

    @PutMapping("/update")
    public CommonResult<Object> updateLayUser(@RequestBody @Validated LayUser layUser, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<String> errorMessages = new ArrayList<>();
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            fieldErrors.forEach(error -> {
                errorMessages.add("(" + error.getField() + ")" + error.getDefaultMessage());
            });
            return new CommonResult<>(500, "提交数据格式不正确", errorMessages);
        }
        UpdateWrapper<LayUser> objectUpdateWrapper = new UpdateWrapper<>();
        objectUpdateWrapper.eq("id", layUser.getId());
        boolean update = layUserService.update(layUser, objectUpdateWrapper);
        if (update) {
            return new CommonResult<>(200, "id：" + layUser.getId() + "信息修改成功", true);
        }
        return new CommonResult<>(500, "id：" + layUser.getId() + "信息修改失败", false);
    }

    @GetMapping("/get/{id}")
    public CommonResult<LayUser> queryLayUserById(@PathVariable("id") Integer id) {
        LayUser layUser = layUserService.getById(id);
        if (!StringUtils.isEmpty(layUser)) {
            return new CommonResult<>(200, "查到id：" + id + "相关信息", layUser);
        }
        return new CommonResult<>(500, "未查到id：" + id + "相关信息", null);
    }

    @DeleteMapping("/del/{id}")
    public CommonResult<Boolean> deleteLayUserById(@PathVariable("id") String id) {
        boolean b = layUserService.removeById(id);
        if (b) {
            return new CommonResult<>(200, "id:" + id + "\t删除成功", b);
        }
        return new CommonResult<>(500, "id:" + id + "\t删除失败", false);
    }

    @DeleteMapping("/dels")
    public CommonResult<Boolean> deleteLayusers(@RequestBody List<Integer> ids) {
        boolean b = layUserService.removeByIds(ids);
        if (b) {
            return new CommonResult<>(200, "删除成功", b);
        }
        return new CommonResult<>(500, "删除成功", false);
    }
}
